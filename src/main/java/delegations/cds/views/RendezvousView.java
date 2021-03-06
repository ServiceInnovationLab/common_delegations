package delegations.cds.views;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.Nullable;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRendezvousView.class)
public abstract class RendezvousView implements BaseView {

    @JsonProperty("id")
    public abstract Long id();

    @JsonProperty("crn")
    public abstract String crn();

    @JsonProperty("owner_code") @Nullable
    public abstract String ownerCode();

    @JsonProperty("delegate_code") @Nullable
    public abstract String delegateCode();
}
