import axios from "axios"
import AddRoom from "../room/AddRoom"

export const api=axios.create({
    baseURL:"http://localhost:8080"
})

/*This Function for Add new Room in Database*/
export async function AddRoom(photo,roomType,roomPrice)
{
    const fromData=new fromData()
        fromData.append("photo",photo)
        fromData.append("roomType",roomType)
        fromData.append("roomPrice",roomPrice)
    const response=await api.post("/room/add/new-room", fromData)

    if(response.status===201)
    {
        return true
    }
    else
    {
        return false
    }
}


/*This Funcation for get roomtype from database */
export async function getRoomTypes()
{
    try{
        const response=await api.get("/rooms/room-types")
        return response.data
    }
    catch(error)
    {
        throw new Error("Error Fetching Room Type")
    }
}
