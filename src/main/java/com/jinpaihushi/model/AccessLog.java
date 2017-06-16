package com.jinpaihushi.model;

import java.io.Serializable;
import java.util.Date;

public class AccessLog implements Serializable {
	private String id;

	private String goodsUrlId;

	private Integer uv;

	private Integer pv;

	private Date accesstime;

	private Date starttime;

	private Date endtime;

	private String platformId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getGoodsUrlId() {
		return goodsUrlId;
	}

	public void setGoodsUrlId(String goodsUrlId) {
		this.goodsUrlId = goodsUrlId == null ? null : goodsUrlId.trim();
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

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId == null ? null : platformId.trim();
	}
}