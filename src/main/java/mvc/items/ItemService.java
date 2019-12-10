package mvc.items;

public class ItemService {
	
	public ItemDto displayInfo() {
		
		ItemDto itm = new ItemDto();
		itm.setComputer("MacBook");
		itm.setHeadset("Vodafone");
		itm.setPhone1("iphone max pro");
		itm.setPhone2("Samsung S10+");
		
		
		return itm;
	}

}
