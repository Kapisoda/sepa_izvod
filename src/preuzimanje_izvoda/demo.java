package preuzimanje_izvoda;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class demo {
	public static void main(String[] args) throws Exception {

	
	JAXBContext jc = JAXBContext.newInstance(Root.class);

    Unmarshaller unmarshaller = jc.createUnmarshaller();
    Root prviDocument = (Root) unmarshaller.unmarshal(new File("C:\\cmt.xml"));
	
  System.out.println(prviDocument);
	
	
	
	
	}
}
