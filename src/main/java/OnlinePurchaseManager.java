import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int count =0;
    for(int i=0; i< OnlinePurchaseManager.size(); i++){
      if((OnlinePurchaseManager.get(i).isElectronic()==true) && (OnlinePurchaseManager.get(i).equals(maker))){
        count++;
      }
    }
    return count;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    for(int i=0; i< OnlinePurchaseManager.size()-1; i++){
      if(OnlinePurchaseManager.get(i).equals(OnlinePurchaseManager.get(i+1))){
        return true;
      }
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
