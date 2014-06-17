package javaposse.jobdsl.dsl.helpers

import javaposse.jobdsl.dsl.Job
import javaposse.jobdsl.dsl.JobType
import javaposse.jobdsl.dsl.Promotion
import javaposse.jobdsl.dsl.WithXmlAction

class PromotionHelper extends AbstractHelper {

    Job job

    public PromotionHelper(Job job, List<WithXmlAction> withXmlActions, JobType jobType) {
        super(withXmlActions, jobType);
        this.job = job
    }

    def promotion(String name, String icon, String shell) {
        execute {
            def node = it / 'properties' / 'hudson.plugins.promoted__builds.JobPropertyImpl' / 'activeProcessNames'
            node << {
                string name
            }
        }
        job.promotions.add(new Promotion(name, icon, shell))
    }
}
