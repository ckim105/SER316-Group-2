### Quality Policy
> Describe your Quality Policy in detail for this Sprint (remember what I ask you to do when I talk about the "In your Project" part in the lectures and what is mentioned after each assignment (in due course you will need to fill out all of them, check which ones are needed for each Deliverable). You should keep adding things to this file and adjusting your policy as you go.
> Check in Project: Module Concepts document on Canvas in the Project module for more details 

**GitHub Workflow** (start Sprint 1)
  > We will create 1 branch per US using the format 'US# - Task'. When we commit, include the US# - Description in the commit or a description in order to correctly understand the commit. We create a Dev branch which all merges must go to first before it can be merged to master to ensure master is always a stable working version. When we do a pull request to merge to the master branch, another team member must test out the changes before it can be approved to be merged to the master branch. The Git Master will approve the merge if the review looks correct. 
  
**Unit Tests Blackbox** (start Sprint 2)
  > We will be testing all new and changed methods. We will be using EQ and BVA as it is needed. Have a specific blackbox testing file that will test a specific thing. The reviewer must be someone other than the developer.

 **Unit Tests Whitebox** (online: start Sprint 2, campus: start Sprint 3)
  > We will test all new and changed methods. Have a specific whitebox testing file that will test a specific thing. Code coverage should be 90% node (code) coverage and edge (branch) coverage. The reviewer can be the developer. 

**Code Review** (online: due start Sprint 2, campus: start Sprint 3)
  > Your Code Review policy - For our coding policy, whenever we request a PR through GitHub, we are going through the checklist and adding it into the PR comments.   

  > Developer Checklist
  - [ ] Add in comments for all new methods and new classes
  - [ ] All new class names should be upper CamelCase with the first letter uppercase (example: MyClass)
  - [ ] Constants and Enums should be in all CAPS (Example: PI)
  - [ ] Indentation should be consistent
  - [ ] No duplicate code, the code must be unique and not excessively long
  - [ ] No lazy classes or classes that do too little

  > Reviewer Checklist
  - [ ] Add in comments for all new methods and new classes
  - [ ] All new class names should be upper CamelCase with the first letter uppercase (example: MyClass)
  - [ ] Constants and Enums should be in all CAPS (Example: PI)
  - [ ] Indentation should be consistent
  - [ ] No duplicate code, the code must be unique and not excessively long
  - [ ] No lazy classes or classes that do too little

**Static Analysis**  (online: start Sprint 3, campus: start Sprint 3)
  > Developer wil go through the new code and file every time a User Story is finished to make sure there are no logical errors. CheckStyle should be implemented every time a User Story is finished to review the coding style and clearing up violations. 

**Continuous Integration**  (start Sprint 3)
  > This is a system that we are already using, but whenever a user story or task is finished, the branch should be requested to merge with dev. This is to always test that it will work when merged in with dev. Dev will act as the continous working copy so that any errors that occur doesn't break master. At the end of the sprint, master will be fast-forwarded from the dev branch.
