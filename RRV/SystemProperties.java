import java.util.Properties;
import java.util.Enumeration;
class SystemProperties{
	public static void main(String[]args){

		Properties p = System.getProperties();
		Enumeration e = p.propertyNames
			();
		 while (e.hasMoreElements()){

			String pname = (String)e.nextElement();
			String pvalue= p.getProperty(pname);
			System.out.println(pname+"="+pvalue);
		}
	}
}