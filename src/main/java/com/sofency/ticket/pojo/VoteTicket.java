package com.sofency.ticket.pojo;

import java.util.Date;

public class VoteTicket extends VoteTicketKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteticket.activity_name
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    private String activityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteticket.begin_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    private Date beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteticket.end_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteticket.vote_type
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    private Byte voteType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteticket.activity_name
     *
     * @return the value of voteticket.activity_name
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteticket.activity_name
     *
     * @param activityName the value for voteticket.activity_name
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteticket.begin_time
     *
     * @return the value of voteticket.begin_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteticket.begin_time
     *
     * @param beginTime the value for voteticket.begin_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteticket.end_time
     *
     * @return the value of voteticket.end_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteticket.end_time
     *
     * @param endTime the value for voteticket.end_time
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteticket.vote_type
     *
     * @return the value of voteticket.vote_type
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public Byte getVoteType() {
        return voteType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteticket.vote_type
     *
     * @param voteType the value for voteticket.vote_type
     *
     * @mbg.generated Sun Apr 19 08:40:26 CST 2020
     */
    public void setVoteType(Byte voteType) {
        this.voteType = voteType;
    }
}