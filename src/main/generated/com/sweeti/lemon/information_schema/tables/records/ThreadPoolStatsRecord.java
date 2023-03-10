/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.ThreadPoolStats;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThreadPoolStatsRecord extends TableRecordImpl<ThreadPoolStatsRecord> implements Record11<Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.THREAD_POOL_STATS.GROUP_ID</code>.
     */
    public ThreadPoolStatsRecord setGroupId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.GROUP_ID</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS</code>.
     */
    public ThreadPoolStatsRecord setThreadCreations(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS</code>.
     */
    public Long getThreadCreations() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS_DUE_TO_STALL</code>.
     */
    public ThreadPoolStatsRecord setThreadCreationsDueToStall(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS_DUE_TO_STALL</code>.
     */
    public Long getThreadCreationsDueToStall() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>information_schema.THREAD_POOL_STATS.WAKES</code>.
     */
    public ThreadPoolStatsRecord setWakes(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.WAKES</code>.
     */
    public Long getWakes() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.WAKES_DUE_TO_STALL</code>.
     */
    public ThreadPoolStatsRecord setWakesDueToStall(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.WAKES_DUE_TO_STALL</code>.
     */
    public Long getWakesDueToStall() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>information_schema.THREAD_POOL_STATS.THROTTLES</code>.
     */
    public ThreadPoolStatsRecord setThrottles(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.THROTTLES</code>.
     */
    public Long getThrottles() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>information_schema.THREAD_POOL_STATS.STALLS</code>.
     */
    public ThreadPoolStatsRecord setStalls(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.STALLS</code>.
     */
    public Long getStalls() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_LISTENER</code>.
     */
    public ThreadPoolStatsRecord setPollsByListener(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_LISTENER</code>.
     */
    public Long getPollsByListener() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_WORKER</code>.
     */
    public ThreadPoolStatsRecord setPollsByWorker(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_WORKER</code>.
     */
    public Long getPollsByWorker() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_LISTENER</code>.
     */
    public ThreadPoolStatsRecord setDequeuesByListener(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_LISTENER</code>.
     */
    public Long getDequeuesByListener() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_WORKER</code>.
     */
    public ThreadPoolStatsRecord setDequeuesByWorker(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_WORKER</code>.
     */
    public Long getDequeuesByWorker() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ThreadPoolStats.THREAD_POOL_STATS.GROUP_ID;
    }

    @Override
    public Field<Long> field2() {
        return ThreadPoolStats.THREAD_POOL_STATS.THREAD_CREATIONS;
    }

    @Override
    public Field<Long> field3() {
        return ThreadPoolStats.THREAD_POOL_STATS.THREAD_CREATIONS_DUE_TO_STALL;
    }

    @Override
    public Field<Long> field4() {
        return ThreadPoolStats.THREAD_POOL_STATS.WAKES;
    }

    @Override
    public Field<Long> field5() {
        return ThreadPoolStats.THREAD_POOL_STATS.WAKES_DUE_TO_STALL;
    }

    @Override
    public Field<Long> field6() {
        return ThreadPoolStats.THREAD_POOL_STATS.THROTTLES;
    }

    @Override
    public Field<Long> field7() {
        return ThreadPoolStats.THREAD_POOL_STATS.STALLS;
    }

    @Override
    public Field<Long> field8() {
        return ThreadPoolStats.THREAD_POOL_STATS.POLLS_BY_LISTENER;
    }

    @Override
    public Field<Long> field9() {
        return ThreadPoolStats.THREAD_POOL_STATS.POLLS_BY_WORKER;
    }

    @Override
    public Field<Long> field10() {
        return ThreadPoolStats.THREAD_POOL_STATS.DEQUEUES_BY_LISTENER;
    }

    @Override
    public Field<Long> field11() {
        return ThreadPoolStats.THREAD_POOL_STATS.DEQUEUES_BY_WORKER;
    }

    @Override
    public Integer component1() {
        return getGroupId();
    }

    @Override
    public Long component2() {
        return getThreadCreations();
    }

    @Override
    public Long component3() {
        return getThreadCreationsDueToStall();
    }

    @Override
    public Long component4() {
        return getWakes();
    }

    @Override
    public Long component5() {
        return getWakesDueToStall();
    }

    @Override
    public Long component6() {
        return getThrottles();
    }

    @Override
    public Long component7() {
        return getStalls();
    }

    @Override
    public Long component8() {
        return getPollsByListener();
    }

    @Override
    public Long component9() {
        return getPollsByWorker();
    }

    @Override
    public Long component10() {
        return getDequeuesByListener();
    }

    @Override
    public Long component11() {
        return getDequeuesByWorker();
    }

    @Override
    public Integer value1() {
        return getGroupId();
    }

    @Override
    public Long value2() {
        return getThreadCreations();
    }

    @Override
    public Long value3() {
        return getThreadCreationsDueToStall();
    }

    @Override
    public Long value4() {
        return getWakes();
    }

    @Override
    public Long value5() {
        return getWakesDueToStall();
    }

    @Override
    public Long value6() {
        return getThrottles();
    }

    @Override
    public Long value7() {
        return getStalls();
    }

    @Override
    public Long value8() {
        return getPollsByListener();
    }

    @Override
    public Long value9() {
        return getPollsByWorker();
    }

    @Override
    public Long value10() {
        return getDequeuesByListener();
    }

    @Override
    public Long value11() {
        return getDequeuesByWorker();
    }

    @Override
    public ThreadPoolStatsRecord value1(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value2(Long value) {
        setThreadCreations(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value3(Long value) {
        setThreadCreationsDueToStall(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value4(Long value) {
        setWakes(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value5(Long value) {
        setWakesDueToStall(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value6(Long value) {
        setThrottles(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value7(Long value) {
        setStalls(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value8(Long value) {
        setPollsByListener(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value9(Long value) {
        setPollsByWorker(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value10(Long value) {
        setDequeuesByListener(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord value11(Long value) {
        setDequeuesByWorker(value);
        return this;
    }

    @Override
    public ThreadPoolStatsRecord values(Integer value1, Long value2, Long value3, Long value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThreadPoolStatsRecord
     */
    public ThreadPoolStatsRecord() {
        super(ThreadPoolStats.THREAD_POOL_STATS);
    }

    /**
     * Create a detached, initialised ThreadPoolStatsRecord
     */
    public ThreadPoolStatsRecord(Integer groupId, Long threadCreations, Long threadCreationsDueToStall, Long wakes, Long wakesDueToStall, Long throttles, Long stalls, Long pollsByListener, Long pollsByWorker, Long dequeuesByListener, Long dequeuesByWorker) {
        super(ThreadPoolStats.THREAD_POOL_STATS);

        setGroupId(groupId);
        setThreadCreations(threadCreations);
        setThreadCreationsDueToStall(threadCreationsDueToStall);
        setWakes(wakes);
        setWakesDueToStall(wakesDueToStall);
        setThrottles(throttles);
        setStalls(stalls);
        setPollsByListener(pollsByListener);
        setPollsByWorker(pollsByWorker);
        setDequeuesByListener(dequeuesByListener);
        setDequeuesByWorker(dequeuesByWorker);
    }

    /**
     * Create a detached, initialised ThreadPoolStatsRecord
     */
    public ThreadPoolStatsRecord(com.sweeti.lemon.information_schema.tables.pojos.ThreadPoolStats value) {
        super(ThreadPoolStats.THREAD_POOL_STATS);

        if (value != null) {
            setGroupId(value.getGroupId());
            setThreadCreations(value.getThreadCreations());
            setThreadCreationsDueToStall(value.getThreadCreationsDueToStall());
            setWakes(value.getWakes());
            setWakesDueToStall(value.getWakesDueToStall());
            setThrottles(value.getThrottles());
            setStalls(value.getStalls());
            setPollsByListener(value.getPollsByListener());
            setPollsByWorker(value.getPollsByWorker());
            setDequeuesByListener(value.getDequeuesByListener());
            setDequeuesByWorker(value.getDequeuesByWorker());
        }
    }
}
