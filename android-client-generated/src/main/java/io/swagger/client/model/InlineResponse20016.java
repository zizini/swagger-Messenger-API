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

import io.swagger.client.model.GroupChat;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20016 {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("groupChat")
  private GroupChat groupChat = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GroupChat getGroupChat() {
    return groupChat;
  }
  public void setGroupChat(GroupChat groupChat) {
    this.groupChat = groupChat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016 inlineResponse20016 = (InlineResponse20016) o;
    return (this.success == null ? inlineResponse20016.success == null : this.success.equals(inlineResponse20016.success)) &&
        (this.groupChat == null ? inlineResponse20016.groupChat == null : this.groupChat.equals(inlineResponse20016.groupChat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.success == null ? 0: this.success.hashCode());
    result = 31 * result + (this.groupChat == null ? 0: this.groupChat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016 {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  groupChat: ").append(groupChat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}