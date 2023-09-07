package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("C:/Mywork/IMG_0691.jpeg");
			newFile = new FileOutputStream("C:\\Users\\ICT04-08\\Desktop\\copy.jpeg");
			
			byte[]arr = new byte[100];
			
			while(true) {
				// 읽어 들인 데이터가 있다면 읽은 데이터 길이 변환, 없다면 -1을 변환
				int result = oldFile.read(arr);
				if(result == -1) break;
		
				//바이트 단위로 0부터 읽은 크기까지의 파일을 작성.
				newFile.write(arr,0,result);
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
