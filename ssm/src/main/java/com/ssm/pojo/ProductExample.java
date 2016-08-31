package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductcodeIsNull() {
            addCriterion("productcode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productcode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productcode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productcode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productcode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productcode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productcode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productcode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productcode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productcode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productcode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productcode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productcode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productcode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andAppminversionIsNull() {
            addCriterion("appminversion is null");
            return (Criteria) this;
        }

        public Criteria andAppminversionIsNotNull() {
            addCriterion("appminversion is not null");
            return (Criteria) this;
        }

        public Criteria andAppminversionEqualTo(String value) {
            addCriterion("appminversion =", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionNotEqualTo(String value) {
            addCriterion("appminversion <>", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionGreaterThan(String value) {
            addCriterion("appminversion >", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionGreaterThanOrEqualTo(String value) {
            addCriterion("appminversion >=", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionLessThan(String value) {
            addCriterion("appminversion <", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionLessThanOrEqualTo(String value) {
            addCriterion("appminversion <=", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionLike(String value) {
            addCriterion("appminversion like", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionNotLike(String value) {
            addCriterion("appminversion not like", value, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionIn(List<String> values) {
            addCriterion("appminversion in", values, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionNotIn(List<String> values) {
            addCriterion("appminversion not in", values, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionBetween(String value1, String value2) {
            addCriterion("appminversion between", value1, value2, "appminversion");
            return (Criteria) this;
        }

        public Criteria andAppminversionNotBetween(String value1, String value2) {
            addCriterion("appminversion not between", value1, value2, "appminversion");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(String value) {
            addCriterion("isonline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(String value) {
            addCriterion("isonline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(String value) {
            addCriterion("isonline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(String value) {
            addCriterion("isonline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(String value) {
            addCriterion("isonline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(String value) {
            addCriterion("isonline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLike(String value) {
            addCriterion("isonline like", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotLike(String value) {
            addCriterion("isonline not like", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<String> values) {
            addCriterion("isonline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<String> values) {
            addCriterion("isonline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(String value1, String value2) {
            addCriterion("isonline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(String value1, String value2) {
            addCriterion("isonline not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsallareaIsNull() {
            addCriterion("isallarea is null");
            return (Criteria) this;
        }

        public Criteria andIsallareaIsNotNull() {
            addCriterion("isallarea is not null");
            return (Criteria) this;
        }

        public Criteria andIsallareaEqualTo(String value) {
            addCriterion("isallarea =", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaNotEqualTo(String value) {
            addCriterion("isallarea <>", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaGreaterThan(String value) {
            addCriterion("isallarea >", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaGreaterThanOrEqualTo(String value) {
            addCriterion("isallarea >=", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaLessThan(String value) {
            addCriterion("isallarea <", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaLessThanOrEqualTo(String value) {
            addCriterion("isallarea <=", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaLike(String value) {
            addCriterion("isallarea like", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaNotLike(String value) {
            addCriterion("isallarea not like", value, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaIn(List<String> values) {
            addCriterion("isallarea in", values, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaNotIn(List<String> values) {
            addCriterion("isallarea not in", values, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaBetween(String value1, String value2) {
            addCriterion("isallarea between", value1, value2, "isallarea");
            return (Criteria) this;
        }

        public Criteria andIsallareaNotBetween(String value1, String value2) {
            addCriterion("isallarea not between", value1, value2, "isallarea");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
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