/** 
* Team.java
 * Creates New Team
 *
 * @author Anna Lehner
 * @version 6/12/22 Sprint 2
 */
package main.java.memoranda.ui;

public class Team {
	private Member teamM1, teamM2, teamM3, teamM4;
	private String teamName;
	
	/**
	 * Constructor for Team
	 * @param inTeamName
	 * @param inTeamM1
	 * @param inTM1R
	 * @param inTeamM2
	 * @param inTM2R
	 * @param inTeamM3
	 * @param inTM3R
	 * @param inTeamM4
	 * @param inTM4R
	 */
	public Team(String inTeamName, String inTeamM1, int inTM1R, String inTeamM2, int inTM2R,
			String inTeamM3, int inTM3R, String inTeamM4, int inTM4R) {
		teamName = inTeamName;
		teamM1 = new Member(inTeamM1, inTM1R);
		teamM2 = new Member(inTeamM2, inTM2R);
		teamM3 = new Member(inTeamM3, inTM3R);
		teamM4 = new Member(inTeamM4, inTM4R);
	}
	
	/**
	 * Team Member Object
	 */
	private static class Member {
		private String username;
		private enum Role {SCRUMMASTER, GITMASTER, CODER};
		private Role role;
		
		/**
		 * Constructor for Team Member
		 * @param username
		 * @param inType
		 */
		public Member(String username, int inType) {
			this.username = username;
			if (inType == 0) {role = Role.SCRUMMASTER;}
			if (inType == 1) {role = Role.GITMASTER;}
			if (inType == 2) {role = Role.CODER;}			
		}		
	}

}
