package javaposse.jobdsl.dsl;

/**
 * @author Andrew Potter (ddcapotter)
 */
public class Promotion {

    public final String name;
    public final String icon;
    public final String shell;

    public Promotion(String name, String icon, String shell) {
        this.name = name;
        this.icon = icon;
        this.shell = shell;
    }

    public String getPromotionXml() {
        return "<?xml version='1.0' encoding='UTF-8'?>\n" +
                "<hudson.plugins.promoted__builds.PromotionProcess plugin=\"promoted-builds@2.17\">\n" +
                "  <actions/>\n" +
                "  <keepDependencies>false</keepDependencies>\n" +
                "  <properties />\n" +
                "  <scm class=\"hudson.scm.NullSCM\"/>\n" +
                "  <canRoam>false</canRoam>\n" +
                "  <disabled>false</disabled>\n" +
                "  <blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>\n" +
                "  <blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>\n" +
                "  <triggers/>\n" +
                "  <concurrentBuild>false</concurrentBuild>\n" +
                "  <conditions>\n" +
                "    <hudson.plugins.promoted__builds.conditions.ManualCondition>\n" +
                "      <users></users>\n" +
                "      <parameterDefinitions/>\n" +
                "    </hudson.plugins.promoted__builds.conditions.ManualCondition>\n" +
                "  </conditions>\n" +
                "  <icon>" + this.icon + "</icon>\n" +
                "  <assignedLabel>master</assignedLabel>\n" +
                "  <buildSteps>\n" +
                "    <hudson.tasks.Shell>\n" +
                "      <command>" + this.shell + "</command>\n" +
                "    </hudson.tasks.Shell>\n" +
                "  </buildSteps>\n" +
                "</hudson.plugins.promoted__builds.PromotionProcess>";
    }
}
