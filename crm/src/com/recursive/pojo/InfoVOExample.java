package com.recursive.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InfoVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InfoVOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andSalonInfoIdIsNull() {
            addCriterion("salon_info_id is null");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdIsNotNull() {
            addCriterion("salon_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdEqualTo(Integer value) {
            addCriterion("salon_info_id =", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotEqualTo(Integer value) {
            addCriterion("salon_info_id <>", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdGreaterThan(Integer value) {
            addCriterion("salon_info_id >", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salon_info_id >=", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdLessThan(Integer value) {
            addCriterion("salon_info_id <", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("salon_info_id <=", value, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdIn(List<Integer> values) {
            addCriterion("salon_info_id in", values, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotIn(List<Integer> values) {
            addCriterion("salon_info_id not in", values, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("salon_info_id between", value1, value2, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salon_info_id not between", value1, value2, "salonInfoId");
            return (Criteria) this;
        }

        public Criteria andSalonNameIsNull() {
            addCriterion("salon_name is null");
            return (Criteria) this;
        }

        public Criteria andSalonNameIsNotNull() {
            addCriterion("salon_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalonNameEqualTo(String value) {
            addCriterion("salon_name =", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameNotEqualTo(String value) {
            addCriterion("salon_name <>", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameGreaterThan(String value) {
            addCriterion("salon_name >", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameGreaterThanOrEqualTo(String value) {
            addCriterion("salon_name >=", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameLessThan(String value) {
            addCriterion("salon_name <", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameLessThanOrEqualTo(String value) {
            addCriterion("salon_name <=", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameLike(String value) {
            addCriterion("salon_name like", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameNotLike(String value) {
            addCriterion("salon_name not like", value, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameIn(List<String> values) {
            addCriterion("salon_name in", values, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameNotIn(List<String> values) {
            addCriterion("salon_name not in", values, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameBetween(String value1, String value2) {
            addCriterion("salon_name between", value1, value2, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonNameNotBetween(String value1, String value2) {
            addCriterion("salon_name not between", value1, value2, "salonName");
            return (Criteria) this;
        }

        public Criteria andSalonAddressIsNull() {
            addCriterion("salon_address is null");
            return (Criteria) this;
        }

        public Criteria andSalonAddressIsNotNull() {
            addCriterion("salon_address is not null");
            return (Criteria) this;
        }

        public Criteria andSalonAddressEqualTo(String value) {
            addCriterion("salon_address =", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressNotEqualTo(String value) {
            addCriterion("salon_address <>", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressGreaterThan(String value) {
            addCriterion("salon_address >", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressGreaterThanOrEqualTo(String value) {
            addCriterion("salon_address >=", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressLessThan(String value) {
            addCriterion("salon_address <", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressLessThanOrEqualTo(String value) {
            addCriterion("salon_address <=", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressLike(String value) {
            addCriterion("salon_address like", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressNotLike(String value) {
            addCriterion("salon_address not like", value, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressIn(List<String> values) {
            addCriterion("salon_address in", values, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressNotIn(List<String> values) {
            addCriterion("salon_address not in", values, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressBetween(String value1, String value2) {
            addCriterion("salon_address between", value1, value2, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andSalonAddressNotBetween(String value1, String value2) {
            addCriterion("salon_address not between", value1, value2, "salonAddress");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoIsNull() {
            addCriterion("salon_wechat_public_no is null");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoIsNotNull() {
            addCriterion("salon_wechat_public_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoEqualTo(String value) {
            addCriterion("salon_wechat_public_no =", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoNotEqualTo(String value) {
            addCriterion("salon_wechat_public_no <>", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoGreaterThan(String value) {
            addCriterion("salon_wechat_public_no >", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoGreaterThanOrEqualTo(String value) {
            addCriterion("salon_wechat_public_no >=", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoLessThan(String value) {
            addCriterion("salon_wechat_public_no <", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoLessThanOrEqualTo(String value) {
            addCriterion("salon_wechat_public_no <=", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoLike(String value) {
            addCriterion("salon_wechat_public_no like", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoNotLike(String value) {
            addCriterion("salon_wechat_public_no not like", value, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoIn(List<String> values) {
            addCriterion("salon_wechat_public_no in", values, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoNotIn(List<String> values) {
            addCriterion("salon_wechat_public_no not in", values, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoBetween(String value1, String value2) {
            addCriterion("salon_wechat_public_no between", value1, value2, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andSalonWechatPublicNoNotBetween(String value1, String value2) {
            addCriterion("salon_wechat_public_no not between", value1, value2, "salonWechatPublicNo");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdIsNull() {
            addCriterion("contacts_open_id is null");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdIsNotNull() {
            addCriterion("contacts_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdEqualTo(String value) {
            addCriterion("contacts_open_id =", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdNotEqualTo(String value) {
            addCriterion("contacts_open_id <>", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdGreaterThan(String value) {
            addCriterion("contacts_open_id >", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_open_id >=", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdLessThan(String value) {
            addCriterion("contacts_open_id <", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdLessThanOrEqualTo(String value) {
            addCriterion("contacts_open_id <=", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdLike(String value) {
            addCriterion("contacts_open_id like", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdNotLike(String value) {
            addCriterion("contacts_open_id not like", value, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdIn(List<String> values) {
            addCriterion("contacts_open_id in", values, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdNotIn(List<String> values) {
            addCriterion("contacts_open_id not in", values, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdBetween(String value1, String value2) {
            addCriterion("contacts_open_id between", value1, value2, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsOpenIdNotBetween(String value1, String value2) {
            addCriterion("contacts_open_id not between", value1, value2, "contactsOpenId");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameIsNull() {
            addCriterion("contacts_wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameIsNotNull() {
            addCriterion("contacts_wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameEqualTo(String value) {
            addCriterion("contacts_wechat_name =", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameNotEqualTo(String value) {
            addCriterion("contacts_wechat_name <>", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameGreaterThan(String value) {
            addCriterion("contacts_wechat_name >", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_wechat_name >=", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameLessThan(String value) {
            addCriterion("contacts_wechat_name <", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_wechat_name <=", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameLike(String value) {
            addCriterion("contacts_wechat_name like", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameNotLike(String value) {
            addCriterion("contacts_wechat_name not like", value, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameIn(List<String> values) {
            addCriterion("contacts_wechat_name in", values, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameNotIn(List<String> values) {
            addCriterion("contacts_wechat_name not in", values, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameBetween(String value1, String value2) {
            addCriterion("contacts_wechat_name between", value1, value2, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatNameNotBetween(String value1, String value2) {
            addCriterion("contacts_wechat_name not between", value1, value2, "contactsWechatName");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadIsNull() {
            addCriterion("contacts_wechat_head is null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadIsNotNull() {
            addCriterion("contacts_wechat_head is not null");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadEqualTo(String value) {
            addCriterion("contacts_wechat_head =", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadNotEqualTo(String value) {
            addCriterion("contacts_wechat_head <>", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadGreaterThan(String value) {
            addCriterion("contacts_wechat_head >", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_wechat_head >=", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadLessThan(String value) {
            addCriterion("contacts_wechat_head <", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadLessThanOrEqualTo(String value) {
            addCriterion("contacts_wechat_head <=", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadLike(String value) {
            addCriterion("contacts_wechat_head like", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadNotLike(String value) {
            addCriterion("contacts_wechat_head not like", value, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadIn(List<String> values) {
            addCriterion("contacts_wechat_head in", values, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadNotIn(List<String> values) {
            addCriterion("contacts_wechat_head not in", values, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadBetween(String value1, String value2) {
            addCriterion("contacts_wechat_head between", value1, value2, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andContactsWechatHeadNotBetween(String value1, String value2) {
            addCriterion("contacts_wechat_head not between", value1, value2, "contactsWechatHead");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionIsNull() {
            addCriterion("salon_intention is null");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionIsNotNull() {
            addCriterion("salon_intention is not null");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionEqualTo(Byte value) {
            addCriterion("salon_intention =", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionNotEqualTo(Byte value) {
            addCriterion("salon_intention <>", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionGreaterThan(Byte value) {
            addCriterion("salon_intention >", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionGreaterThanOrEqualTo(Byte value) {
            addCriterion("salon_intention >=", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionLessThan(Byte value) {
            addCriterion("salon_intention <", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionLessThanOrEqualTo(Byte value) {
            addCriterion("salon_intention <=", value, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionIn(List<Byte> values) {
            addCriterion("salon_intention in", values, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionNotIn(List<Byte> values) {
            addCriterion("salon_intention not in", values, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionBetween(Byte value1, Byte value2) {
            addCriterion("salon_intention between", value1, value2, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andSalonIntentionNotBetween(Byte value1, Byte value2) {
            addCriterion("salon_intention not between", value1, value2, "salonIntention");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andContactsSexIsNull() {
            addCriterion("contacts_sex is null");
            return (Criteria) this;
        }

        public Criteria andContactsSexIsNotNull() {
            addCriterion("contacts_sex is not null");
            return (Criteria) this;
        }

        public Criteria andContactsSexEqualTo(Byte value) {
            addCriterion("contacts_sex =", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexNotEqualTo(Byte value) {
            addCriterion("contacts_sex <>", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexGreaterThan(Byte value) {
            addCriterion("contacts_sex >", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("contacts_sex >=", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexLessThan(Byte value) {
            addCriterion("contacts_sex <", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexLessThanOrEqualTo(Byte value) {
            addCriterion("contacts_sex <=", value, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexIn(List<Byte> values) {
            addCriterion("contacts_sex in", values, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexNotIn(List<Byte> values) {
            addCriterion("contacts_sex not in", values, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexBetween(Byte value1, Byte value2) {
            addCriterion("contacts_sex between", value1, value2, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andContactsSexNotBetween(Byte value1, Byte value2) {
            addCriterion("contacts_sex not between", value1, value2, "contactsSex");
            return (Criteria) this;
        }

        public Criteria andStaffSizeIsNull() {
            addCriterion("staff_size is null");
            return (Criteria) this;
        }

        public Criteria andStaffSizeIsNotNull() {
            addCriterion("staff_size is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSizeEqualTo(Integer value) {
            addCriterion("staff_size =", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeNotEqualTo(Integer value) {
            addCriterion("staff_size <>", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeGreaterThan(Integer value) {
            addCriterion("staff_size >", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_size >=", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeLessThan(Integer value) {
            addCriterion("staff_size <", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_size <=", value, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeIn(List<Integer> values) {
            addCriterion("staff_size in", values, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeNotIn(List<Integer> values) {
            addCriterion("staff_size not in", values, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeBetween(Integer value1, Integer value2) {
            addCriterion("staff_size between", value1, value2, "staffSize");
            return (Criteria) this;
        }

        public Criteria andStaffSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_size not between", value1, value2, "staffSize");
            return (Criteria) this;
        }

        public Criteria andSalonCommentIsNull() {
            addCriterion("salon_comment is null");
            return (Criteria) this;
        }

        public Criteria andSalonCommentIsNotNull() {
            addCriterion("salon_comment is not null");
            return (Criteria) this;
        }

        public Criteria andSalonCommentEqualTo(String value) {
            addCriterion("salon_comment =", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentNotEqualTo(String value) {
            addCriterion("salon_comment <>", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentGreaterThan(String value) {
            addCriterion("salon_comment >", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentGreaterThanOrEqualTo(String value) {
            addCriterion("salon_comment >=", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentLessThan(String value) {
            addCriterion("salon_comment <", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentLessThanOrEqualTo(String value) {
            addCriterion("salon_comment <=", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentLike(String value) {
            addCriterion("salon_comment like", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentNotLike(String value) {
            addCriterion("salon_comment not like", value, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentIn(List<String> values) {
            addCriterion("salon_comment in", values, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentNotIn(List<String> values) {
            addCriterion("salon_comment not in", values, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentBetween(String value1, String value2) {
            addCriterion("salon_comment between", value1, value2, "salonComment");
            return (Criteria) this;
        }

        public Criteria andSalonCommentNotBetween(String value1, String value2) {
            addCriterion("salon_comment not between", value1, value2, "salonComment");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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