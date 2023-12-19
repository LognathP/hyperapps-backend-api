import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@Configuration
@PropertySource("classpath:/application.properties")
public class Test {
	
	 @Value("${sms.url}")
	  private String url;
	
	public void smsTest()
	{
//		final String uri = "http://bhashsms.com/api/sendmsg.php?user=8754556606&pass=984b5ac&sender=HPRLNK&phone=9965861660&text=Test SMS&priority=ndnd&stype=normal";
//
//	    RestTemplate restTemplate = new RestTemplate();
//	    String result = restTemplate.getForObject(uri, String.class);
//
//	    System.out.println(result);
		
	
		
		
		System.out.println(url);
	}
	public static void main(String[] args) throws Exception {
		
			//new Test().smsTest();
	//System.out.println(DESEncryptor.encrypt("Test@123", "hyperapp123"));
//		String en = DESEncryptor.encrypt("Test@123", "hyperapp123");
		//System.out.println(DESEncryptor.decrypt("PUqrwY1F6Mp1DihwxsbKcg==", "hyperapp123"));
//		Gson gson = new Gson(); 
//		//String userJson = "[{\"name\":\"Chennai\",\"lat\":\"12.920423\",\"long\":\"80.097207\",\"address\":\"51, Ramani Nagar, West Tambaram, Chennai, Tamilnadu - 600045, India\"}]";
//		String userJson = "[{\"phone\": \"8888888888\"},{\"phone\": \"9952175446\"},{\"phone\": \"9952175444\"}]";
//		
//		BusinessPhone [] userArray = gson.fromJson(userJson, BusinessPhone[].class); 
//		for (BusinessPhone store : userArray) {
//			System.out.println(store.getPhone());
//		}
		
//		 JSONParser parser = new JSONParser();
//	      try {
//	         Object obj = parser.parse(new FileReader("C:\\Users\\fsslaptop9\\Downloads\\State-zip-code-GeoJSON-master\\State-zip-code-GeoJSON-master\\dc_district_of_columbia_zip_codes_geo.min.json"));
//	         JSONObject jsonObject = (JSONObject)obj;
//	        
//	         JSONArray subjects = (JSONArray) jsonObject.get("features.properties");
//	        
//	         System.out.println(subjects);
//	         
////	        JSONArray j = (JSONArray)subjects.get("properties");
////	      
////	         System.out.println("features: "+j);
////	         Iterator iterator = j.iterator();
////	         while (iterator.hasNext()) {
////	            System.out.println(iterator.next());
////	         }
//	      } catch(Exception e) {
//	         e.printStackTrace();
//	      }
//		Calendar calendar = Calendar.getInstance();
//		Date date = calendar.getTime();
//	System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()).toLowerCase());
//	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
//	System.out.println(formatter.format(calendar.getTime()));
//	
//		String string1 = "20:11";
//	    Date time1 = new SimpleDateFormat("HH:mm").parse(string1);
//	    Calendar calendar1 = Calendar.getInstance();
//	    calendar1.setTime(time1);
//	    calendar1.add(Calendar.DATE, 1);
//
//
//	    String string2 = "23:49";
//	    Date time2 = new SimpleDateFormat("HH:mm").parse(string2);
//	    Calendar calendar2 = Calendar.getInstance();
//	    calendar2.setTime(time2);
//	    calendar2.add(Calendar.DATE, 1);
//
//	    String someRandomTime = formatter.format(calendar.getTime());
//	    Date d = new SimpleDateFormat("HH:mm").parse(someRandomTime);
//	    Calendar calendar3 = Calendar.getInstance();
//	    calendar3.setTime(d);
//	    calendar3.add(Calendar.DATE, 1);
//	    Date x = calendar3.getTime();
//	    System.out.println(x + " " +calendar1.getTime() + " " +calendar2.getTime() );
//
//	    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
//	        //checkes whether the current time is between 14:49:00 and 20:11:13.
//	        System.out.println("true");
//	    }
//		
//	   
//	    System.out.println(new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date()));  
	   
//		JSONArray ja = new JSONArray();
//		JSONObject jo = new JSONObject();
//		JSONObject rest = new JSONObject();
//		jo.put("message", "");
//		jo.put("status", 0);
//		jo.put("errorCode", "");
//		jo.put("result",rest );
//		jo.put("responseCode", "");
//		ja.add(jo);
//		System.out.println(ja.toString());
//		
//		System.out.println(Double.parseDouble("90.00"));
//		
//	LinkedList<Integer> l = new LinkedList<>();
//	l.add(5);
//	l.add(1);
//	String m = "Hello World!";
//	String h = m.substring(6,12) + m.substring(12,6);
//	System.out.println(h);
//		System.out.println(Double.parseDouble("100.00"));
//		System.out.println(new FileSystemResource("Procfile").getFile().getAbsolutePath());
//System.out.println(java.time.LocalDate.now()+"#*&076#"+Math.random()+"@#");
//String st = "sdf"+java.time.LocalDate.now();
//Base64.Encoder encoder = Base64.getEncoder();
//System.out.println(encoder.encode(st.getBytes()));
		//new PushNotificationService().sendPushNotificationWithData();
		//new EmailServiceImpl().sendEmail("lognathparamashivam@gmail.com", "Hi", "Good Afternoon");
//	int age = 10;
//	assert age <= 19 : "Cannot";
//	System.out.println(age);
			
//	List<Integer> i = new ArrayList<Integer>();
//	i.add(1);
//	i.add(2);
//	i.add(3);
//	
//	System.out.println(i.toString().replace("[", "(").replace("]", ")"));
//			
//	
			//System.out.println(CommonUtils.distance(17.3445533, 78.4938407, 17.456371871317938, 78.44719758465853, "K"));
		
//		String s = "453,Bajanai Kovil,Medavakkam,Chennai,600100,Tamil Nadu";
//		String sar [] = s.split(",");
//		for (String string : sar) {
//			System.out.println(string);
//		}
			
		String req = "{\r\n"
				+ "    \"request_id\": \"09062023121826170\",\r\n"
				+ "    \"pickup_details\": [\r\n"
				+ "        {\r\n"
				+ "            \"reference_id\": \"P09062023121826170\",\r\n"
				+ "            \"address\": {\r\n"
				+ "                \"street_address_1\": \"Flat 119 Street No. 1 Czech Colony,Sanath Nagar,Hyderabad,Telangana,500018\",\r\n"
				+ "                \"lat\": 17.4552868441905,\r\n"
				+ "                \"lng\": 78.43544474605945,\r\n"
				+ "                \"contact_details\": {\r\n"
				+ "                    \"name\": \"Store Incharge\",\r\n"
				+ "                    \"phone_number\": \"8754556606\"\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"optimised_route\": true,\r\n"
				+ "    \"drop_details\": [\r\n"
				+ "        {\r\n"
				+ "            \"reference_id\": \"D09062023121826169\",\r\n"
				+ "            \"address\": {\r\n"
				+ "                \"street_address_1\": \"2nd floor,Uppal,Ranga Reddy,Santosh Nagar,Hyderabad,Telangana,500038\",\r\n"
				+ "                \"lat\": 17.438,\r\n"
				+ "                \"lng\": 78.443,\r\n"
				+ "                \"contact_details\": {\r\n"
				+ "                    \"name\": \"Najeeb\",\r\n"
				+ "                    \"phone_number\": \"8686922038\"\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"payment_method\": \"DUNZO_CREDIT\",\r\n"
				+ "    \"amount\": \"100\"\r\n"
				+ "}";
		RestTemplate rest = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.set("client-id", "ca92c908-6c0f-40f7-b9c3-7d92844608a2");
		headers.set("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkIjp7InJvbGUiOjEwMCwidWlkIjoiYWU1M2ViZjMtN2M3OS00YWRiLTlkNGUtNWRlZGY4YTZmZTNlIn0sIm1lcmNoYW50X3R5cGUiOm51bGwsImNsaWVudF9pZCI6ImNhOTJjOTA4LTZjMGYtNDBmNy1iOWMzLTdkOTI4NDQ2MDhhMiIsImF1ZCI6Imh0dHBzOi8vaWRlbnRpdHl0b29sa2l0Lmdvb2dsZWFwaXMuY29tL2dvb2dsZS5pZGVudGl0eS5pZGVudGl0eXRvb2xraXQudjEuSWRlbnRpdHlUb29sa2l0IiwibmFtZSI6InRlc3RfNTkyODIyNDA1OSIsInV1aWQiOiJhZTUzZWJmMy03Yzc5LTRhZGItOWQ0ZS01ZGVkZjhhNmZlM2UiLCJyb2xlIjoxMDAsImR1bnpvX2tleSI6Ijc5MGRhZmY3LTdjNmMtNGJiMC1iY2E1LTE2Y2Q0NmI3YWVjOSIsImV4cCI6MTgxMjIyMTg0NywidiI6MCwiaWF0IjoxNjU2NzAxODQ3LCJzZWNyZXRfa2V5IjoiZDc3MTMwNTEtYWRiMi00NTNiLWE3ODktZjY2YzY3NjJkOWQxIn0.7h-asF2lMk1wh12ZeuHRbLJ7xOZiRQtow3NIyT9eEaE");
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<String>(req, headers);
		ResponseEntity<String> response = rest.exchange("https://apis-staging.dunzo.in/api/v2/tasks", HttpMethod.POST, request, String.class);
		System.out.println(response);
	}
}
