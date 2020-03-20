package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteA2CharsTest {
	/* TODO list for my feature
	 * 1.4 characters : ABCD  =>  BCD
	 * 2.4 characters : AACD  =>  CD
	 * 3.4 characters : BACD  =>  BCD
	 * 4.4 characters : BBAA  =>  BBAA
	 * 5.n characters : AABAA => BAA
	 */
		DeleteAInString d ;
		
		@BeforeEach
		void createObject() {
			d = new DeleteAInString();
		}
		@Test
		void testcharacters(){
			assertEquals("CD",d.deleteA("AACD"));
		}
		

		
		@Test
		void test4characters() {
			
			assertEquals("BCD", d.deleteA("ABCD"));
			assertEquals("BCD", d.deleteA("BACD"));
			assertEquals("BBAA", d.deleteA("BBAA"));
			//assertEquals("AACD", d.deleteA("AACD"));

		
		}
		
		@Test
		void testNcharacters() {
			
			assertEquals("BAA", d.deleteA("AABAA"));

		}

	}
	




