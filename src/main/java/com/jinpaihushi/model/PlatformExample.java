package com.jinpaihushi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlatformExample implements Serializable {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PlatformExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andCompanyIsNull() {
			addCriterion("company is null");
			return (Criteria) this;
		}

		public Criteria andCompanyIsNotNull() {
			addCriterion("company is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyEqualTo(String value) {
			addCriterion("company =", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotEqualTo(String value) {
			addCriterion("company <>", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyGreaterThan(String value) {
			addCriterion("company >", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyGreaterThanOrEqualTo(String value) {
			addCriterion("company >=", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLessThan(String value) {
			addCriterion("company <", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLessThanOrEqualTo(String value) {
			addCriterion("company <=", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLike(String value) {
			addCriterion("company like", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotLike(String value) {
			addCriterion("company not like", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyIn(List<String> values) {
			addCriterion("company in", values, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotIn(List<String> values) {
			addCriterion("company not in", values, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyBetween(String value1, String value2) {
			addCriterion("company between", value1, value2, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotBetween(String value1, String value2) {
			addCriterion("company not between", value1, value2, "company");
			return (Criteria) this;
		}

		public Criteria andChannelIsNull() {
			addCriterion("channel is null");
			return (Criteria) this;
		}

		public Criteria andChannelIsNotNull() {
			addCriterion("channel is not null");
			return (Criteria) this;
		}

		public Criteria andChannelEqualTo(String value) {
			addCriterion("channel =", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotEqualTo(String value) {
			addCriterion("channel <>", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelGreaterThan(String value) {
			addCriterion("channel >", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelGreaterThanOrEqualTo(String value) {
			addCriterion("channel >=", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLessThan(String value) {
			addCriterion("channel <", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLessThanOrEqualTo(String value) {
			addCriterion("channel <=", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelLike(String value) {
			addCriterion("channel like", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotLike(String value) {
			addCriterion("channel not like", value, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelIn(List<String> values) {
			addCriterion("channel in", values, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotIn(List<String> values) {
			addCriterion("channel not in", values, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelBetween(String value1, String value2) {
			addCriterion("channel between", value1, value2, "channel");
			return (Criteria) this;
		}

		public Criteria andChannelNotBetween(String value1, String value2) {
			addCriterion("channel not between", value1, value2, "channel");
			return (Criteria) this;
		}

		public Criteria andContactsNameIsNull() {
			addCriterion("contacts_name is null");
			return (Criteria) this;
		}

		public Criteria andContactsNameIsNotNull() {
			addCriterion("contacts_name is not null");
			return (Criteria) this;
		}

		public Criteria andContactsNameEqualTo(String value) {
			addCriterion("contacts_name =", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameNotEqualTo(String value) {
			addCriterion("contacts_name <>", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameGreaterThan(String value) {
			addCriterion("contacts_name >", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
			addCriterion("contacts_name >=", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameLessThan(String value) {
			addCriterion("contacts_name <", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameLessThanOrEqualTo(String value) {
			addCriterion("contacts_name <=", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameLike(String value) {
			addCriterion("contacts_name like", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameNotLike(String value) {
			addCriterion("contacts_name not like", value, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameIn(List<String> values) {
			addCriterion("contacts_name in", values, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameNotIn(List<String> values) {
			addCriterion("contacts_name not in", values, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameBetween(String value1, String value2) {
			addCriterion("contacts_name between", value1, value2, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsNameNotBetween(String value1, String value2) {
			addCriterion("contacts_name not between", value1, value2, "contactsName");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneIsNull() {
			addCriterion("contacts_phone is null");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneIsNotNull() {
			addCriterion("contacts_phone is not null");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneEqualTo(String value) {
			addCriterion("contacts_phone =", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneNotEqualTo(String value) {
			addCriterion("contacts_phone <>", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneGreaterThan(String value) {
			addCriterion("contacts_phone >", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("contacts_phone >=", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneLessThan(String value) {
			addCriterion("contacts_phone <", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
			addCriterion("contacts_phone <=", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneLike(String value) {
			addCriterion("contacts_phone like", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneNotLike(String value) {
			addCriterion("contacts_phone not like", value, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneIn(List<String> values) {
			addCriterion("contacts_phone in", values, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneNotIn(List<String> values) {
			addCriterion("contacts_phone not in", values, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneBetween(String value1, String value2) {
			addCriterion("contacts_phone between", value1, value2, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andContactsPhoneNotBetween(String value1, String value2) {
			addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNull() {
			addCriterion("company_address is null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNotNull() {
			addCriterion("company_address is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressEqualTo(String value) {
			addCriterion("company_address =", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotEqualTo(String value) {
			addCriterion("company_address <>", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThan(String value) {
			addCriterion("company_address >", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
			addCriterion("company_address >=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThan(String value) {
			addCriterion("company_address <", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
			addCriterion("company_address <=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLike(String value) {
			addCriterion("company_address like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotLike(String value) {
			addCriterion("company_address not like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIn(List<String> values) {
			addCriterion("company_address in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotIn(List<String> values) {
			addCriterion("company_address not in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressBetween(String value1, String value2) {
			addCriterion("company_address between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotBetween(String value1, String value2) {
			addCriterion("company_address not between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreatorIdIsNull() {
			addCriterion("creator_id is null");
			return (Criteria) this;
		}

		public Criteria andCreatorIdIsNotNull() {
			addCriterion("creator_id is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorIdEqualTo(String value) {
			addCriterion("creator_id =", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdNotEqualTo(String value) {
			addCriterion("creator_id <>", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdGreaterThan(String value) {
			addCriterion("creator_id >", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
			addCriterion("creator_id >=", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdLessThan(String value) {
			addCriterion("creator_id <", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdLessThanOrEqualTo(String value) {
			addCriterion("creator_id <=", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdLike(String value) {
			addCriterion("creator_id like", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdNotLike(String value) {
			addCriterion("creator_id not like", value, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdIn(List<String> values) {
			addCriterion("creator_id in", values, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdNotIn(List<String> values) {
			addCriterion("creator_id not in", values, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdBetween(String value1, String value2) {
			addCriterion("creator_id between", value1, value2, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorIdNotBetween(String value1, String value2) {
			addCriterion("creator_id not between", value1, value2, "creatorId");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIsNull() {
			addCriterion("creator_name is null");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIsNotNull() {
			addCriterion("creator_name is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorNameEqualTo(String value) {
			addCriterion("creator_name =", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotEqualTo(String value) {
			addCriterion("creator_name <>", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameGreaterThan(String value) {
			addCriterion("creator_name >", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
			addCriterion("creator_name >=", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLessThan(String value) {
			addCriterion("creator_name <", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLessThanOrEqualTo(String value) {
			addCriterion("creator_name <=", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLike(String value) {
			addCriterion("creator_name like", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotLike(String value) {
			addCriterion("creator_name not like", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIn(List<String> values) {
			addCriterion("creator_name in", values, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotIn(List<String> values) {
			addCriterion("creator_name not in", values, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameBetween(String value1, String value2) {
			addCriterion("creator_name between", value1, value2, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotBetween(String value1, String value2) {
			addCriterion("creator_name not between", value1, value2, "creatorName");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}