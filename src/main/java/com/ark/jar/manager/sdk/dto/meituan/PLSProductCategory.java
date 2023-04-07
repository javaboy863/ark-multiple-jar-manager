package com.ark.jar.manager.sdk.dto.meituan;

/**
 * @Description:
 *
 */
public class PLSProductCategory {
	/**
	 * @Description:
	 *
	 */
	public long id;
	/**
	 * @Description:
	 *
	 */
	public String name;

	/**
	 * @Description:
	 *
	 */
	public int level;

	/**
	 * @Description:
	 *
	 */
	public String namePath;

	public PLSProductCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNamePath() {
		return this.namePath;
	}

	public void setNamePath(String namePath) {
		this.namePath = namePath;
	}

	public String toString() {
		return "PLSProductCategory{id=" + this.id + ", name='" + this.name + '\'' + ", level=" + this.level + ", namePath='" + this.namePath + '\'' + '}';
	}
}
