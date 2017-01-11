package demo;

import java.io.File;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class XML_Persist {
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	public void write(Emp e, String filePath) {
		try {
			marshaller.marshal(e, new StreamResult(new File(filePath)));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void read(String filePath) {
		try {
			Emp e = (Emp) unmarshaller.unmarshal(new StreamSource(new File(filePath)));
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Marshaller getMarshaller() {
		return marshaller;
	}

	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

}
