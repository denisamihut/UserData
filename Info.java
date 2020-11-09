package nov04;

public class Info {
	
		private String name1;
		private String name2;
		private int age;
		private String address;

		public Info (String name1, String name2, String address, int age) {
			this.name1 = name1;
			this.name2 = name2;
			this.address = address;
			this.age = age;
		}

		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2= name2;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		
		}
	