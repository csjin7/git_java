package chap141;

public class Member {
	private String name;
	private String id;
	private Address address;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	
	public Member(String name) {
		System.out.println("Member(String id) 실행");
		this.name = name;
	}

	public Member(String name, String id) {
		System.out.println("Member(String name, String id) 실행");
		this.name = name;
		this.id = id;
	}

	
	public Member(String name, String id, Address address) {
		System.out.println("Member(String name, String id, Address address) 실행");
		this.name = name;
		this.id = id;
		this.address = address;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}
	
}
