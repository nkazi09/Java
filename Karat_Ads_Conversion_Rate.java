import java.util.*;

public class Karat_Ads_Conversion_Rate {
	//https://leetcode.com/discuss/interview-question/2079040/karat-screening-new-grad-position-may-2022
	
	// The people who buy ads on our network don't have enough data about how ads are working for
	//their business. They've asked us to find out which ads produce the most purchases on their website.

	// Our client provided us with a list of user IDs of customers who bought something on a landing page
	//after clicking one of their ads:

	// # Each user completed 1 purchase.
	// completed_purchase_user_ids = [
	//   "3123122444","234111110", "8321125440", "99911063"]

	// And our ops team provided us with some raw log data from our ad server showing every time a
	//user clicked on one of our ads:
	// ad_clicks = [
	//  #"IP_Address,Time,Ad_Text",
	//  "122.121.0.1,2016-11-03 11:41:19,Buy wool coats for your pets",
	//  "96.3.199.11,2016-10-15 20:18:31,2017 Pet Mittens",
	//  "122.121.0.250,2016-11-01 06:13:13,The Best Hollywood Coats",
	//  "82.1.106.8,2016-11-12 23:05:14,Buy wool coats for your pets",
	//  "92.130.6.144,2017-01-01 03:18:55,Buy wool coats for your pets",
	//  "92.130.6.145,2017-01-01 03:18:55,2017 Pet Mittens",
	//]
	       
	//The client also sent over the IP addresses of all their users.
	       
	//all_user_ips = [
	//  #"User_ID,IP_Address",
	//   "2339985511,122.121.0.155",
	//  "234111110,122.121.0.1",
	//  "3123122444,92.130.6.145",
	//  "39471289472,2001:0db8:ac10:fe01:0000:0000:0000:0000",
	//  "8321125440,82.1.106.8",
	//  "99911063,92.130.6.144"
	//]
	       
	// Write a function to parse this data, determine how many times each ad was clicked,
	//then return the ad text, that ad's number of clicks, and how many of those ad clicks
	//were from users who made a purchase.


	// Expected output:
	// Bought Clicked Ad Text
	// 1 of 2  2017 Pet Mittens
	// 0 of 1  The Best Hollywood Coats
	// 3 of 3  Buy wool coats for your pets
	
	public static void adsConversionRate(List<String> completedPurchaseUserIds, 
			List<List<String>> adClicks, 
			// IP, userId
			Map<String, String> allUserIPs) {

		Set<String> userIds = new HashSet<>(completedPurchaseUserIds);
		//ad, click count
		//Clicks contans all ads
		Map<String, Integer> clicks = new HashMap<>();
		//ad, puchesd
		Map<String, Set<String>> itemToPurchase = new HashMap<>();
		
		
		for(List<String> click : adClicks) {
			String ip = click.get(0);
			String ad = click.get(2);
			clicks.put(ad, clicks.getOrDefault(ad, 0) + 1);
			String user = allUserIPs.get(ip);
			if(userIds.contains(user)) {
				itemToPurchase.computeIfAbsent(user, x->new HashSet<>()).add(user);
			}
		}
	
		for(String ad : clicks.keySet()) {
			int totalCount = clicks.get(ad);
			int purchase = itemToPurchase.containsKey(ad) ? itemToPurchase.get(ad).size() : 0;
			System.out.println(purchase + " Of " + totalCount + " " + ad);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] completed_purchase_user_ids_array = {"3123122444","234111110", "8321125440", "99911063"};
		List<String> completed_purchase_user_ids = Arrays.asList(completed_purchase_user_ids_array);

		String[] all_user_ips_array = {
		"User_ID,IP_Address",
		"2339985511,122.121.0.155",
		"234111110,122.121.0.1",
		"3123122444,92.130.6.145",
		"39471289472,2001:0db8:ac10:fe01:0000:0000:0000:0000",
		"8321125440,82.1.106.8",
		"99911063,92.130.6.144"
		};
		
		List<String> all_user_ips = Arrays.asList(all_user_ips_array);
		
		

	}

}
