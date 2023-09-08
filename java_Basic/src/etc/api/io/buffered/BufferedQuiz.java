package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

				/*
		         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
		          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
		         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
		          파일을 작성합니다. 
		          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
		           연결해 주시면 됩니다.)
		                각 문장은 줄 개행을 포함합니다.
		         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
		          파일을 읽어서 콘솔에 출력해 보세요.
		         */
		FileWriter fw = null;
		BufferedWriter bw = null;
		LocalDate currentLocalDate = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름을 설정하십시오 : ");
		String name = sc.next();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			File file= new File("C:/Mywork/"+currentLocalDate.now()+"file/"+name+".txt");
			if(!file.exists()) {
				file.mkdirs();
				System.out.println("폴더 및 파일 생성 완료");
			}
			fw = new FileWriter("C:/Mywork/"+currentLocalDate.now()+"file/"+name+".txt");
			bw = new BufferedWriter(fw);
			while(true) {
				System.out.println("문장을 입력하세요 : ");
				System.out.print("> ");
				String str = sc.nextLine();
				bw.write(str+"\r\n");
				if(str.equals("그만")) {
					System.out.println("입력을 중지합니다.");
					break;
				}
			}
			System.out.println("=====================================\n");
			System.out.println("내용을 출력합니다.");
			fr = new FileReader("C:/Mywork/"+currentLocalDate.now()+"file/"+name+".txt");
			br = new BufferedReader(fr);
			String str2;
			while((str2 = br.readLine()) != null) {
				System.out.println(str2);
			}
		}catch(Exception e) {
		}finally {
			try {
				br.close();
				fr.close();
				sc.close();
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
