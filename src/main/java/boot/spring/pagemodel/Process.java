package boot.spring.pagemodel;

public class Process {
    private String id;

    private String DeploymentId;

    private String name;

    private String ResourceName;

    private String key;

    private String diagramresourcename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeploymentId() {
        return DeploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        DeploymentId = deploymentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceName() {
        return ResourceName;
    }

    public void setResourceName(String resourceName) {
        ResourceName = resourceName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDiagramresourcename() {
        return diagramresourcename;
    }

    public void setDiagramresourcename(String diagramresourcename) {
        this.diagramresourcename = diagramresourcename;
    }

}
