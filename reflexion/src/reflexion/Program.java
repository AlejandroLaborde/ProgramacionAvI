package reflexion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {

		Persona p = new Persona();
		Class c = p.getClass();
		
		Field[] fields = c.getFields();
	
		for (Field field : fields) {
			String atributo = field.getName();
			String a = ucFirst(atributo);
			System.out.println(a);
			Method[] methods = c.getMethods();
			for (Method method : methods) {
			
				if(method.getName().contains("set"+ a)) {
					System.out.println("ENTROO");
					try {
						Object[] ob = new Object[1];
						ob[0]= "asdasd";
						method.invoke(p, ob);
					
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			

		}
		
		
		
		

	}
	
	public static String ucFirst(String str) {
	    if (str.isEmpty()) {
	        return str;
	    } else {
	        return Character.toUpperCase(str.charAt(0)) + str.substring(1); 
	    }
	}

}
