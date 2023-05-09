// Java MD5

// MD5(Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Common uses for MD5:

// to store a one-way hash of a password
// to provide some assurance that a transferred file has arrived intact

// Given an alphanumeric string, s , denoting a password, compute and print its MD5 encryption value.

// Example:
// Input: s = "helloworld"
// Output: 68e109f0f40ca72a15e05cc22786f8e6

import java.util.*;
import java.security.*;
import java.io.*;

public class MD5{
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] hash = md5.digest(s.getBytes());

		StringBuilder sb = new StringBuilder();
		for (byte b : hash){
			sb.append(String.format("%02x",b)); // convert byte array to hex
		}

		System.out.println(sb.toString());

	}
}
