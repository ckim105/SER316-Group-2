package test;

import main.java.memoranda.ui.TaskDialog;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sprint2_Whitebox {
//===================================US#47 Tests================================================
	/**
	 * Tests for User Story #47. Test if TaskDialog is able to initialize.
	 */
	  /**
	   * Test 1: Test that creating a task with AppFrame works
	   * @since 1.0
	   */
	  @Test
	  public void taskDialogWorks() {
	      App test = new App(true);
	      TaskDialog test1 = new TaskDialog(test.getFrame(), "New Task");
	      
	      String comp = "New Task";
	      
	      assertTrue(comp == test1.getTitle());
	}	
}