package net.wagstrom.research.github;

import com.ibm.research.govsci.graph.StringableEnum;

public enum PropertyName implements StringableEnum {
	ACTIONS("actions"),
	ADDITIONS("additions"),
	AUTHORED_DATE("authoredDate"),
	BODY("body"),
	BILLING_EMAIL("billingEmail"),
	BLOG("blog"),
	CLONE_URL("cloneUrl"),
	CLOSED_AT("closedAt"),
	COLLABORATORS("collaborators"),
	COMMENTS("comments"),
	COMMITTED_DATE("commitedDate"),
	COMMIT_ID("commitId"),
	COMMITS("commits"),
	COMPANY("company"),
	CREATED_AT("createdAt"),
	DATE("date"),
	DELETIONS("deletions"),
	DESCRIPTION("description"),
	DIFF_HUNK("diffHunk"),
	DIFF_URL("diffUrl"),
	DISK_USAGE("diskUsage"),
	EMAIL("email"),
	FOLLOWERS("followers"),
	FOLLOWING("following"),
	FORKS("forks"),
	FULLNAME("fullname"),
	GITHUB_ID("gitHubId"),
	GIT_URL("gitUrl"),
	GRAVATAR_ID("gravatarId"),
	HOMEPAGE("homepage"),
	HTML_URL("htmlUrl"),
	ID_NUM("id_num"),
	ISSUE_CREATED_AT("issueCreatedAt"),
	ISSUE_UPDATED_AT("issueUpdatedAt"),
	IS_MERGE("isMerge"),
	LABEL("label"),
	LANGUAGE("language"),
	LOCATION("location"),
	LOGIN("login"),
	MASTER_BRANCH("masterBranch"),
	MESSAGE("message"),
	MERGED_AT("merged_at"),
	MIRROR_URL("mirrorUrl"),
	NAME("name"),
	NUMBER("number"),
	OPEN_ISSUES("openIssues"),
	ORGANIZATION("organization"),
	ORG_TYPE("orgType"),
	ORIGINAL_COMMIT_ID("originalCommitId"),
	OWNED_PRIVATE_REPO_COUNT("ownedPrivateRepoCount"),
	OWNER("owner"),
	PARENT("parent"),
	PATCH_URL("patchUrl"),
	PATH("path"),
	POSITION("position"),
	PRIVATE_GIST_COUNT("private_gist_count"),
	PUBLIC_GIST_COUNT("public_gist_count"),
	PUBLIC_REPO_COUNT("public_repo_count"),
	PUSHED_AT("pushedAt"),
	REF("ref"),
	REPO("repo"),
	REPO_TYPE("repoType"),
	SCORE("score"),
	SHA("sha"),
	SIZE("size"),
	SOURCE("source"),
	SPACE("space"),
	SSH_URL("sshUrl"),
	SVN_URL("svnUrl"),
	STATE("state"),
	SYS_COMMENTS_ADDED("sys_comments_added"),
	SYS_DISCUSSIONS_ADDED("sys_discussions_added"),
	SYS_LAST_FULL_UPDATE("sys_last_full_update"),
	SYS_LAST_UPDATED("sys_last_updated"),
	SYS_UPDATE_COMPLETE("sys_update_complete"),
	TOTAL_PRIVATE_REPO_COUNT("totalPrivateRepoCount"),
	TIME("time"),
	TITLE("title"),
	TREE("tree"),
	TYPE("type"),
	UPDATED_AT("updatedAt"),
	URL("url"),
	USER("user"),
	USERNAME("username"), // FIXME: is this the same as USER?
	VOTES("votes"),
	WATCHERS("watchers"),
	WHEN("when");
	
	private String text;
	
	PropertyName(String text) {
		this.text = text;
	}
	
	public String toString() {
		return this.text;
	}
	
	public static PropertyName fromString(String text) {
		if (text != null) {
			for (PropertyName d : PropertyName.values()) {
				if (text.equals(d.text)) { return d; }
			}
		}
		throw new IllegalArgumentException("PropertyType: '" + text + "' not valid");
	}
}