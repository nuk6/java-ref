package objectdemo;

public class ElectricityBill {
	 private int meterNo;
	 private String name;
	 private String address;
	public ElectricityBill(int meterNo, String name, String address) {
		this.meterNo = meterNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ElectricityBill [meterNo=" + meterNo + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return this.meterNo;
	}
	@Override
	public boolean equals(Object obj) {
		ElectricityBill eBill = (ElectricityBill) obj;
		return (eBill.meterNo == this.meterNo);
	}
	public static void main(String[] args) {
		ElectricityBill eBill = new ElectricityBill(80, "Nk", "HRS");
		ElectricityBill eBill2 = new ElectricityBill(80, "Vn", "BBR");
		System.out.println(eBill);
		System.out.println(eBill2);
		System.out.println(eBill.hashCode());
		System.out.println(eBill2.hashCode());
		System.out.println(eBill.equals(eBill2));
		System.out.println(eBill2.equals(eBill));
	}
}
