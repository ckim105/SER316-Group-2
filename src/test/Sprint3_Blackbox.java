package test;

import main.java.memoranda.ui.TaskDialog;
import main.java.memoranda.ui.Team;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sprint3_Blackbox {
	//===================================US#64 Tests================================================
		/**
		 * Tests for User Story #64. Test if Team getters work.
		 */
		  /**
		   * Test 1: Test that creating a team works.
		   * @since 1.0
		   */
		  @Test
		  public void teamWorks() {
		      
		      Team test1 = new Team("Alpha", "a", 1, "a", 1, "a", 1, "a", 1);
		      
		      String comp = "Alpha";
		      
		      assertTrue(comp == test1.getTeamName());
		}	
}

