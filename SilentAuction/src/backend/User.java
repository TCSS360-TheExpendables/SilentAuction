package backend;

import java.util.EventListener;
import java.util.LinkedList;
import java.util.List;

public class User implements EventListener
{
  public final String name;
  private final List<Bid> bids;
  private final List<Contribution> donations;
  
  public User(final String name)
  {
    this.name = name;
<<<<<<< HEAD
    this.bids = new LinkedList<Bid>();
    this.donations = new LinkedList<Contribution>();
    
=======
    this.ID = hashCode();
    this.email = email;
    this.phone = phone;
    //comment
>>>>>>> origin/master
  }
  @Override
  public int hashCode()
  {
    return this.name.hashCode();
  }
  
  public void placeBid(final Item item, final double amount)
  {
    Bid bid = new Bid(amount, this.name.hashCode());
    item.addBid(bid);
    this.bids.add(bid);
  }
  
  public void donate(final double cash)
  {
    this.donate(new Cash(cash));
  }
  public void donate(final Contribution contribution)
  {
    this.donations.add(contribution);
  }
  
}