package com.jinpaihushi.model;

import java.io.Serializable;
import java.util.Date;

public class AccessLog implements Serializable {
	private Integer id;

	private Integer goodsUrlId;

	private Integer uv;

	private Integer pv;

	private Date accesstime;

	private Date starttime;

	private Date endtime;

	private Integer platformId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsUrlId() {
		return goodsUrlId;
	}

	public void setGoodsUrlId(Integer goodsUrlId) {
		this.goodsUrlId = goodsUrlId;
	}

	public Integer getUv() {
		return uv;
	}

	public void setUv(Integer uv) {
		this.uv = uv;
	}

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Date getAccesstime() {
		return accesstime;
	}

	public void setAccesstime(Date accesstime) {
		this.accesstime = accesstime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Integer getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}
}