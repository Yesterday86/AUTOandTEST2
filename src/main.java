import java.io.BufferedReader;
import java.io.FileReader;
public class main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		String  line = br.readLine();
		int size = line.length();
		br.close();
    	
		FileReader fr = new FileReader("text.txt");
        int count = 0;
        char[] c = new char[size];
        fr.read(c);
        	for(int i = 1; i < size; i++) {
        		if((!Character.isWhitespace(c[i-1])) && (Character.isWhitespace(c[i]))) {
        			++count; 
        		}
        	}
        	if(!Character.isWhitespace(c[size-1])) {
        		++count; 
        	} 
        fr.close(); 
        System.out.println(count); 
	}
}