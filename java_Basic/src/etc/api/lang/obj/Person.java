package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	//Person객체의 이름을 비교해 주는 메서드롤 override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if(obj instanceof Person) {
			Person p = (Person)obj;//Object 타입을 Person타입으로 형 변환 ->name 과 age를 확인가능.
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
			
		}
		return false;
	}
	
	//equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋다.
	//equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문
	//hashCode의 값도 그에 맞게 같이 재 정의가 되어야합니다. (hash주소를 equals에 맞게 정의)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	
	//객체 복사 메서드
	//cloneable 인터페이스를 구현해서 사용해야합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출(gc가 실행될때)
		System.out.println(this.name+"이 죽었습니다.");
	}

	public void personInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
	}
}
