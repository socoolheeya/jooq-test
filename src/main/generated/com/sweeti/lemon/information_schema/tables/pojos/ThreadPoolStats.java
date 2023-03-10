/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThreadPoolStats implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer groupId;
    private final Long threadCreations;
    private final Long threadCreationsDueToStall;
    private final Long wakes;
    private final Long wakesDueToStall;
    private final Long throttles;
    private final Long stalls;
    private final Long pollsByListener;
    private final Long pollsByWorker;
    private final Long dequeuesByListener;
    private final Long dequeuesByWorker;

    public ThreadPoolStats(ThreadPoolStats value) {
        this.groupId = value.groupId;
        this.threadCreations = value.threadCreations;
        this.threadCreationsDueToStall = value.threadCreationsDueToStall;
        this.wakes = value.wakes;
        this.wakesDueToStall = value.wakesDueToStall;
        this.throttles = value.throttles;
        this.stalls = value.stalls;
        this.pollsByListener = value.pollsByListener;
        this.pollsByWorker = value.pollsByWorker;
        this.dequeuesByListener = value.dequeuesByListener;
        this.dequeuesByWorker = value.dequeuesByWorker;
    }

    public ThreadPoolStats(
        Integer groupId,
        Long threadCreations,
        Long threadCreationsDueToStall,
        Long wakes,
        Long wakesDueToStall,
        Long throttles,
        Long stalls,
        Long pollsByListener,
        Long pollsByWorker,
        Long dequeuesByListener,
        Long dequeuesByWorker
    ) {
        this.groupId = groupId;
        this.threadCreations = threadCreations;
        this.threadCreationsDueToStall = threadCreationsDueToStall;
        this.wakes = wakes;
        this.wakesDueToStall = wakesDueToStall;
        this.throttles = throttles;
        this.stalls = stalls;
        this.pollsByListener = pollsByListener;
        this.pollsByWorker = pollsByWorker;
        this.dequeuesByListener = dequeuesByListener;
        this.dequeuesByWorker = dequeuesByWorker;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.GROUP_ID</code>.
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS</code>.
     */
    public Long getThreadCreations() {
        return this.threadCreations;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.THREAD_CREATIONS_DUE_TO_STALL</code>.
     */
    public Long getThreadCreationsDueToStall() {
        return this.threadCreationsDueToStall;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.WAKES</code>.
     */
    public Long getWakes() {
        return this.wakes;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.WAKES_DUE_TO_STALL</code>.
     */
    public Long getWakesDueToStall() {
        return this.wakesDueToStall;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.THROTTLES</code>.
     */
    public Long getThrottles() {
        return this.throttles;
    }

    /**
     * Getter for <code>information_schema.THREAD_POOL_STATS.STALLS</code>.
     */
    public Long getStalls() {
        return this.stalls;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_LISTENER</code>.
     */
    public Long getPollsByListener() {
        return this.pollsByListener;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.POLLS_BY_WORKER</code>.
     */
    public Long getPollsByWorker() {
        return this.pollsByWorker;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_LISTENER</code>.
     */
    public Long getDequeuesByListener() {
        return this.dequeuesByListener;
    }

    /**
     * Getter for
     * <code>information_schema.THREAD_POOL_STATS.DEQUEUES_BY_WORKER</code>.
     */
    public Long getDequeuesByWorker() {
        return this.dequeuesByWorker;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ThreadPoolStats other = (ThreadPoolStats) obj;
        if (this.groupId == null) {
            if (other.groupId != null)
                return false;
        }
        else if (!this.groupId.equals(other.groupId))
            return false;
        if (this.threadCreations == null) {
            if (other.threadCreations != null)
                return false;
        }
        else if (!this.threadCreations.equals(other.threadCreations))
            return false;
        if (this.threadCreationsDueToStall == null) {
            if (other.threadCreationsDueToStall != null)
                return false;
        }
        else if (!this.threadCreationsDueToStall.equals(other.threadCreationsDueToStall))
            return false;
        if (this.wakes == null) {
            if (other.wakes != null)
                return false;
        }
        else if (!this.wakes.equals(other.wakes))
            return false;
        if (this.wakesDueToStall == null) {
            if (other.wakesDueToStall != null)
                return false;
        }
        else if (!this.wakesDueToStall.equals(other.wakesDueToStall))
            return false;
        if (this.throttles == null) {
            if (other.throttles != null)
                return false;
        }
        else if (!this.throttles.equals(other.throttles))
            return false;
        if (this.stalls == null) {
            if (other.stalls != null)
                return false;
        }
        else if (!this.stalls.equals(other.stalls))
            return false;
        if (this.pollsByListener == null) {
            if (other.pollsByListener != null)
                return false;
        }
        else if (!this.pollsByListener.equals(other.pollsByListener))
            return false;
        if (this.pollsByWorker == null) {
            if (other.pollsByWorker != null)
                return false;
        }
        else if (!this.pollsByWorker.equals(other.pollsByWorker))
            return false;
        if (this.dequeuesByListener == null) {
            if (other.dequeuesByListener != null)
                return false;
        }
        else if (!this.dequeuesByListener.equals(other.dequeuesByListener))
            return false;
        if (this.dequeuesByWorker == null) {
            if (other.dequeuesByWorker != null)
                return false;
        }
        else if (!this.dequeuesByWorker.equals(other.dequeuesByWorker))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.groupId == null) ? 0 : this.groupId.hashCode());
        result = prime * result + ((this.threadCreations == null) ? 0 : this.threadCreations.hashCode());
        result = prime * result + ((this.threadCreationsDueToStall == null) ? 0 : this.threadCreationsDueToStall.hashCode());
        result = prime * result + ((this.wakes == null) ? 0 : this.wakes.hashCode());
        result = prime * result + ((this.wakesDueToStall == null) ? 0 : this.wakesDueToStall.hashCode());
        result = prime * result + ((this.throttles == null) ? 0 : this.throttles.hashCode());
        result = prime * result + ((this.stalls == null) ? 0 : this.stalls.hashCode());
        result = prime * result + ((this.pollsByListener == null) ? 0 : this.pollsByListener.hashCode());
        result = prime * result + ((this.pollsByWorker == null) ? 0 : this.pollsByWorker.hashCode());
        result = prime * result + ((this.dequeuesByListener == null) ? 0 : this.dequeuesByListener.hashCode());
        result = prime * result + ((this.dequeuesByWorker == null) ? 0 : this.dequeuesByWorker.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ThreadPoolStats (");

        sb.append(groupId);
        sb.append(", ").append(threadCreations);
        sb.append(", ").append(threadCreationsDueToStall);
        sb.append(", ").append(wakes);
        sb.append(", ").append(wakesDueToStall);
        sb.append(", ").append(throttles);
        sb.append(", ").append(stalls);
        sb.append(", ").append(pollsByListener);
        sb.append(", ").append(pollsByWorker);
        sb.append(", ").append(dequeuesByListener);
        sb.append(", ").append(dequeuesByWorker);

        sb.append(")");
        return sb.toString();
    }
}
