package backend;

import java.util.Map;

public class Auction
{
  private Stats stats;
  
  private Map<Long, Item> items;
  private Map<Long, User> users;
  
  
  
  private class Stats
  {
    private Stats generalStats()
    {
      return stats;
    }
    
    public Stats()
    {
      
    }
  }
}