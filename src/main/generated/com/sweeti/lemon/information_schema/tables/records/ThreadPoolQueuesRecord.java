/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.ThreadPoolQueues;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThreadPoolQueuesRecord extends TableRecordImpl<ThreadPoolQueuesRecord> implements Record5<Integer, Integer, Integer, ULong, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.THREAD_POOL_QUEUES.GROUP_ID</code>.
     */
    public ThreadPoolQueuesRecord setGroupId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_QUEUES.GROUP_ID</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.THREAD_POOL_QUEUES.POSITION</code>.
     */
    public ThreadPoolQueuesRecord setPosition(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_QUEUES.POSITION</code>.
     */
    public Integer getPosition() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>information_schema.THREAD_POOL_QUEUES.PRIORITY</code>.
     */
    public ThreadPoolQueuesRecord setPriority(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_QUEUES.PRIORITY</code>.
     */
    public Integer getPriority() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_QUEUES.CONNECTION_ID</code>.
     */
    public ThreadPoolQueuesRecord setConnectionId(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_QUEUES.CONNECTION_ID</code>.
     */
    public ULong getConnectionId() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.THREAD_POOL_QUEUES.QUEUEING_TIME_MICROSECONDS</code>.
     */
    public ThreadPoolQueuesRecord setQueueingTimeMicroseconds(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_QUEUES.QUEUEING_TIME_MICROSECONDS</code>.
     */
    public Long getQueueingTimeMicroseconds() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Integer, ULong, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, Integer, ULong, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ThreadPoolQueues.THREAD_POOL_QUEUES.GROUP_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ThreadPoolQueues.THREAD_POOL_QUEUES.POSITION;
    }

    @Override
    public Field<Integer> field3() {
        return ThreadPoolQueues.THREAD_POOL_QUEUES.PRIORITY;
    }

    @Override
    public Field<ULong> field4() {
        return ThreadPoolQueues.THREAD_POOL_QUEUES.CONNECTION_ID;
    }

    @Override
    public Field<Long> field5() {
        return ThreadPoolQueues.THREAD_POOL_QUEUES.QUEUEING_TIME_MICROSECONDS;
    }

    @Override
    public Integer component1() {
        return getGroupId();
    }

    @Override
    public Integer component2() {
        return getPosition();
    }

    @Override
    public Integer component3() {
        return getPriority();
    }

    @Override
    public ULong component4() {
        return getConnectionId();
    }

    @Override
    public Long component5() {
        return getQueueingTimeMicroseconds();
    }

    @Override
    public Integer value1() {
        return getGroupId();
    }

    @Override
    public Integer value2() {
        return getPosition();
    }

    @Override
    public Integer value3() {
        return getPriority();
    }

    @Override
    public ULong value4() {
        return getConnectionId();
    }

    @Override
    public Long value5() {
        return getQueueingTimeMicroseconds();
    }

    @Override
    public ThreadPoolQueuesRecord value1(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public ThreadPoolQueuesRecord value2(Integer value) {
        setPosition(value);
        return this;
    }

    @Override
    public ThreadPoolQueuesRecord value3(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public ThreadPoolQueuesRecord value4(ULong value) {
        setConnectionId(value);
        return this;
    }

    @Override
    public ThreadPoolQueuesRecord value5(Long value) {
        setQueueingTimeMicroseconds(value);
        return this;
    }

    @Override
    public ThreadPoolQueuesRecord values(Integer value1, Integer value2, Integer value3, ULong value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThreadPoolQueuesRecord
     */
    public ThreadPoolQueuesRecord() {
        super(ThreadPoolQueues.THREAD_POOL_QUEUES);
    }

    /**
     * Create a detached, initialised ThreadPoolQueuesRecord
     */
    public ThreadPoolQueuesRecord(Integer groupId, Integer position, Integer priority, ULong connectionId, Long queueingTimeMicroseconds) {
        super(ThreadPoolQueues.THREAD_POOL_QUEUES);

        setGroupId(groupId);
        setPosition(position);
        setPriority(priority);
        setConnectionId(connectionId);
        setQueueingTimeMicroseconds(queueingTimeMicroseconds);
    }

    /**
     * Create a detached, initialised ThreadPoolQueuesRecord
     */
    public ThreadPoolQueuesRecord(com.sweeti.lemon.information_schema.tables.pojos.ThreadPoolQueues value) {
        super(ThreadPoolQueues.THREAD_POOL_QUEUES);

        if (value != null) {
            setGroupId(value.getGroupId());
            setPosition(value.getPosition());
            setPriority(value.getPriority());
            setConnectionId(value.getConnectionId());
            setQueueingTimeMicroseconds(value.getQueueingTimeMicroseconds());
        }
    }
}
