package com.ark.jar.manager.sdk.dto.meituan;

/**
 * @Description:生效时间参数
 *
 */
public class AvailableTimeParam {
	/**
	 * @Description:星期一
	 *
	 */
	private String monday;

	/**
	 * @Description:星期二
	 *
	 */
	private String tuesday;

	/**
	 * @Description:星期三
	 *
	 */
	private String wednesday;

	/**
	 * @Description:星期四
	 *
	 */
	private String thursday;

	/**
	 * @Description:星期五
	 *
	 */
	private String friday;

	/**
	 * @Description:星期六
	 *
	 */
	private String saturday;

	/**
	 * @Description:星期日
	 *
	 */
	private String sunday;

	/**
	 * @Description:构造函数
	 *
	 * @param time
	 */
	public AvailableTimeParam(String time) {
		this.monday = time;
		this.tuesday = time;
		this.wednesday = time;
		this.thursday = time;
		this.friday = time;
		this.saturday = time;
		this.sunday = time;
	}

	/**
	 * @Description: 重置
	 *
	 * @param time
	 */
	public void reset(String time) {
		this.monday = time;
		this.tuesday = time;
		this.wednesday = time;
		this.thursday = time;
		this.friday = time;
		this.saturday = time;
		this.sunday = time;
	}

	/**
	 * @Description:构造函数
	 *
	 */
	public AvailableTimeParam() {
	}

	/**
	 * @Description:构造函数
	 *
	 * @param monday
	 * @param tuesday
	 * @param wednesday
	 * @param thursday
	 * @param friday
	 * @param saturday
	 * @param sunday
	 */
	public AvailableTimeParam(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}

	public String getMonday() {
		return this.monday;
	}

	public AvailableTimeParam setMonday(String monday) {
		this.monday = monday;
		return this;
	}

	public String getTuesday() {
		return this.tuesday;
	}

	public AvailableTimeParam setTuesday(String tuesday) {
		this.tuesday = tuesday;
		return this;
	}

	public String getWednesday() {
		return this.wednesday;
	}

	public AvailableTimeParam setWednesday(String wednesday) {
		this.wednesday = wednesday;
		return this;
	}

	public String getThursday() {
		return this.thursday;
	}

	public AvailableTimeParam setThursday(String thursday) {
		this.thursday = thursday;
		return this;
	}

	public String getFriday() {
		return this.friday;
	}

	public AvailableTimeParam setFriday(String friday) {
		this.friday = friday;
		return this;
	}

	public String getSaturday() {
		return this.saturday;
	}

	public AvailableTimeParam setSaturday(String saturday) {
		this.saturday = saturday;
		return this;
	}

	public String getSunday() {
		return this.sunday;
	}

	public AvailableTimeParam setSunday(String sunday) {
		this.sunday = sunday;
		return this;
	}
	@Override
	public String toString() {
		return "AvailableTimeParam [monday='" + this.monday + '\'' + ", tuesday='" + this.tuesday + '\'' + ", wednesday='" + this.wednesday + '\'' + ", thursday='" + this.thursday + '\'' + ", friday='" + this.friday + '\'' + ", saturday='" + this.saturday + '\'' + ", sunday='" + this.sunday + '\'' + ']';
	}
}
