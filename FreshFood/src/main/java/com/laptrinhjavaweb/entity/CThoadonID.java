package com.laptrinhjavaweb.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CThoadonID implements Serializable {

	@Column(name = "hoadon_id")
	private int hoadonID;

	@Column(name = "sanpham_id")
	private int sanphamId;

	public CThoadonID() {
	}

	public CThoadonID(int hoadonid, int sanphamid) {
		this.sanphamId = sanphamid;
		this.hoadonID = hoadonid;
	}

	public int getHoadonID() {
		return hoadonID;
	}

	public void setHoadonID(int hoadonID) {
		this.hoadonID = hoadonID;
	}

	public int getSanphamId() {
		return sanphamId;
	}

	public void setSanphamId(int sanphamId) {
		this.sanphamId = sanphamId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof CThoadonID))
			return false;
		CThoadonID that = (CThoadonID) o;
		return Objects.equals(getHoadonID(), that.getHoadonID())
				&& Objects.equals(getSanphamId(), that.getSanphamId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getHoadonID(), getSanphamId());
	}
}
