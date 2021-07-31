package homework12.entities;

public class ClientStatus {

    private String clientName;
    private String clientEmail;
    private String statusAlias;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getStatusAlias() {
        return statusAlias;
    }

    public void setStatusAlias(String statusAlias) {
        this.statusAlias = statusAlias;
    }

    @Override
    public String toString() {
        return "ClientStatus{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", statusAlias='" + statusAlias + '\'' +
                '}';
    }
}
