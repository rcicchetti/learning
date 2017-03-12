package com.github.rcicchetti.learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyStringUtils 
{
	public static char charAt(final String input, final int index) throws StringIndexOutOfBoundsException
	{
		if (index < 0 || index > input.length() - 1)
		{
			throw new StringIndexOutOfBoundsException();
		}
		
		final char[] charArray = input.toCharArray();
		return charArray[index];
	}
	
	public static void printDuplicateCharacters(final String word)
	{
		final char[] characters = word.toCharArray();

		final Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters)
		{
			if (charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch) + 1);
			} 
			else
			{
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet)
		{
			if (entry.getValue() > 1)
			{
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
}
