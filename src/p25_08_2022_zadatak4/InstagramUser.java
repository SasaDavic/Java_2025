package p25_08_2022_zadatak4;

public class InstagramUser {
			
		public InstagramUser(String username, String punoIme, String email) {
		this.username = username;
		this.punoIme = punoIme;
		this.email = email;
	}
		
		private String username;
		private String punoIme;
		private String email;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPunoIme() {
			return punoIme;
		}
		public void setPunoIme(String punoIme) {
			this.punoIme = punoIme;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
}
