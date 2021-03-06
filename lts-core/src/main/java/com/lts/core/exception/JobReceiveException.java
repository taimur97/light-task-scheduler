package com.lts.core.exception;

import com.lts.core.domain.Job;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert HG (254963746@qq.com) on 8/1/14.
 * 客户端提交的任务 接受 异常
 */
public class JobReceiveException extends Exception {

    /**
     * 出错的job列表
     */
    private List<Job> jobs;

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void addJob(Job job){
        if(jobs == null){
            jobs = new ArrayList<Job>();
        }

        jobs.add(job);
    }

    public JobReceiveException() {
    }

    public JobReceiveException(String message) {
        super(message);
    }

    public JobReceiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobReceiveException(Throwable cause) {
        super(cause);
    }

    public JobReceiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
