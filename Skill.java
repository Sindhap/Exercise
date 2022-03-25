package com.example.Demo.Model;

public class Skill {
	 private int skillId;
	    private String skillName;
		public int getSkillId() {
			return skillId;
		}
		public void setSkillId(int skillId) {
			this.skillId = skillId;
		}
		public Skill(int skillId, String skillName) {
			super();
			this.skillId = skillId;
			this.skillName = skillName;
		}
		public String getSkillName() {
			return skillName;
		}
		public void setSkillName(String skillName) {
			this.skillName = skillName;
		}
}
