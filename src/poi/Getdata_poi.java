package poi;

public class Getdata_poi {
	public static void main(String[] args) {
		Reusable_poi poi=new Reusable_poi("D:\\Kishore\\TM_HRM_Automation1\\TM_HRM_Automation1\\TestData\\HRM.xlsx");
		System.out.println(poi.getdata(1,2,2));
	}

}
