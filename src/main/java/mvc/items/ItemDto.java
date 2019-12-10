package mvc.items;

public class ItemDto {

	private String phone1;
	private String phone2;
	private String headset;
	private String computer;

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getHeadset() {
		return headset;
	}

	public void setHeadset(String headset) {
		this.headset = headset;
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "ItemService [phone1=" + phone1 + ", phone2=" + phone2 + ", headset=" + headset + ", computer="
				+ computer + "]";
	}

}
