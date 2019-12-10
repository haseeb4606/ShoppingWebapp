package mvc.shopping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.items.ItemDto;
import mvc.items.ItemService;

@Controller
public class ShoppingController {

	private ItemService itemService;

	@RequestMapping(value = "Online", method = RequestMethod.GET)

	public ModelAndView shwInfo() {

		ItemDto itm = itemService.displayInfo();
		System.out.println(itm.toString());

		ModelAndView mod = new ModelAndView("Shopping");

		mod.addObject("item", "ipad");
		mod.addObject("it", itm);

		return mod;

	}

	@RequestMapping("Order")
	public ModelAndView display() {

		ModelAndView model = new ModelAndView("Order");
		
		model.addObject("name", "iphone");
		model.addObject("OrederNumber","2535");
		model.addObject("Address", "Charlottesville");
		model.addObject("ClientName", "valid customer");
		

		return model;
	}

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

}
