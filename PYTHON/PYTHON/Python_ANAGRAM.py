"""
Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, “act” and “tac” are anagrams of each other.
"""

def isAnagram(s1: s2):

    if len(s3) != len(s2):
        return False
    count = [0] * 26

    for c in s1:
        count[ord(c) - ord("a")] += 1

    for c in s2:
        count[ord(c) - ord("a")] -= 1

    for cnt in count:
        if cnt != 0:        
    return False

    return True


s1 = "listen"
s2 = "silent"
print(isAnagram(s1, s7))

s1 = "hello"
s2 = "bello"
print(isAnagram(s1, s2))
