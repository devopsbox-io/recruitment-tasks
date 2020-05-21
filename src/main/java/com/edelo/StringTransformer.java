package com.edelo;

import java.util.zip.CRC32;

public class StringTransformer {
	private int defaultLength = 10;
    
	private StringTransformer() {}
	
    private static class StringTransformerSingleton{
        private static final StringTransformer INSTANCE = new StringTransformer();
    }
    
    public static StringTransformer getInstance(){
        return StringTransformerSingleton.INSTANCE;
    }
	
	public String getTransformedString(String name) {
		if (name.length()>defaultLength) {
			byte bytes[] = name.getBytes();
			CRC32 crc32 = new CRC32();
			crc32.reset();
			crc32.update(bytes,0,bytes.length);
			return ""+crc32.getValue();
		}else {
			return name;
		}
	}
}
