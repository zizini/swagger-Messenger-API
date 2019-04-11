/**
 * Whats App API
 * Whats App API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: irma.tabakis@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.InlineResponse20014MessagesRead;
import io.swagger.client.model.InlineResponse20014MessagesUnread;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20014Messages {
  
  @SerializedName("unread")
  private List<InlineResponse20014MessagesUnread> unread = null;
  @SerializedName("read")
  private List<InlineResponse20014MessagesRead> read = null;
  @SerializedName("allMessages")
  private List<InlineResponse20014MessagesRead> allMessages = null;
  @SerializedName("last_time_user_entered")
  private String lastTimeUserEntered = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20014MessagesUnread> getUnread() {
    return unread;
  }
  public void setUnread(List<InlineResponse20014MessagesUnread> unread) {
    this.unread = unread;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20014MessagesRead> getRead() {
    return read;
  }
  public void setRead(List<InlineResponse20014MessagesRead> read) {
    this.read = read;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse20014MessagesRead> getAllMessages() {
    return allMessages;
  }
  public void setAllMessages(List<InlineResponse20014MessagesRead> allMessages) {
    this.allMessages = allMessages;
  }

  /**
   * This will be the date time of the last time a user entered a chat.
   **/
  @ApiModelProperty(value = "This will be the date time of the last time a user entered a chat.")
  public String getLastTimeUserEntered() {
    return lastTimeUserEntered;
  }
  public void setLastTimeUserEntered(String lastTimeUserEntered) {
    this.lastTimeUserEntered = lastTimeUserEntered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Messages inlineResponse20014Messages = (InlineResponse20014Messages) o;
    return (this.unread == null ? inlineResponse20014Messages.unread == null : this.unread.equals(inlineResponse20014Messages.unread)) &&
        (this.read == null ? inlineResponse20014Messages.read == null : this.read.equals(inlineResponse20014Messages.read)) &&
        (this.allMessages == null ? inlineResponse20014Messages.allMessages == null : this.allMessages.equals(inlineResponse20014Messages.allMessages)) &&
        (this.lastTimeUserEntered == null ? inlineResponse20014Messages.lastTimeUserEntered == null : this.lastTimeUserEntered.equals(inlineResponse20014Messages.lastTimeUserEntered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.unread == null ? 0: this.unread.hashCode());
    result = 31 * result + (this.read == null ? 0: this.read.hashCode());
    result = 31 * result + (this.allMessages == null ? 0: this.allMessages.hashCode());
    result = 31 * result + (this.lastTimeUserEntered == null ? 0: this.lastTimeUserEntered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014Messages {\n");
    
    sb.append("  unread: ").append(unread).append("\n");
    sb.append("  read: ").append(read).append("\n");
    sb.append("  allMessages: ").append(allMessages).append("\n");
    sb.append("  lastTimeUserEntered: ").append(lastTimeUserEntered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}