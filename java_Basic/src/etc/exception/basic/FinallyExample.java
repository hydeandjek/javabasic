package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {

		String []pets = {"강아지","고양이","짹쨱이"};
		
		for(int i=0;i<=pets.length;i++) {
			try {
				System.out.println(pets[i]+"키우고싶다~");
			}catch(Exception r) {
				System.out.println("애완동물의 정보가 없습니다.");
			}finally {
				//finally 블록에는 예외 발생 여부와 상관없이
				//항상실행하고싶은 문장을 작성.
				//객체를 반납하거나 메모리에서 해제할 때 (close())finally를 주로사용함.
				System.out.println("아무튼 실행되는 문장.");
				System.out.println("----------------");
			}
		}
	}

}
